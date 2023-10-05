SELECT COUNT(S.CAR_ID) AS COUNT, NAME AS DESCRIPTION
FROM EMPLOYEES AS E
LEFT JOIN SELLINGS AS S
ON E.ID = S.EMPLOYEE_ID
GROUP BY E.ID
ORDER BY COUNT DESC;


WITH SalesCounts AS (
    SELECT
        E.ID AS EmployeeID,
        E.NAME AS EmployeeName,
        COUNT(S.CAR_ID) AS SaleCount
    FROM
        EMPLOYEES AS E
            LEFT JOIN SELLINGS AS S ON E.ID = S.EMPLOYEE_ID
    GROUP BY
        E.ID, E.NAME
),

     MaxSaleCount AS (
         SELECT
             MAX(SaleCount) AS MaxCount
         FROM
             SalesCounts
     )

SELECT
    SC.SaleCount AS COUNT,
    CASE
        WHEN SC.SaleCount = MSC.MaxCount THEN SC.EmployeeName
        WHEN (SELECT COUNT(*) FROM SalesCounts WHERE SaleCount = SC.SaleCount) < 2 THEN SC.EmployeeName
        ELSE (
            CASE
                WHEN SC.EmployeeID = (SELECT MIN(EmployeeID) FROM SalesCounts WHERE SaleCount = SC.SaleCount)
                THEN CONCAT(EmployeeName, ' and ', (SELECT COUNT(*) - 1 FROM SalesCounts WHERE SaleCount = SC.SaleCount))
        )
        END AS Description
FROM
    SalesCounts AS SC, MaxSaleCount AS MSC
GROUP BY
    SC.EmployeeID, SC.SaleCount, SC.EmployeeName, MSC.MaxCount;

