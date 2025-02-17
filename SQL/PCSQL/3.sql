SELECT A.ID, A.START_TIME, A.END_TIME
FROM RESERVATION AS A
         LEFT JOIN RESERVATION AS B
                   ON A.ID > B.ID
                       AND A.START_TIME < B.END_TIME
                       AND A.END_TIME > B.START_TIME
WHERE B.ID IS NULL
ORDER BY A.START_TIME;