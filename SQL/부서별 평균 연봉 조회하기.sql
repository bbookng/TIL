SELECT D.DEPT_ID, D.DEPT_NAME_EN, ROUND(AVG(E.SAL), 0) AS AVG_SAL
FROM HR_DEPARTMENT AS D
         JOIN HR_EMPLOYEES AS E
              ON D.DEPT_ID = E.DEPT_ID
GROUP BY DEPT_ID
ORDER BY AVG_SAL DESC;