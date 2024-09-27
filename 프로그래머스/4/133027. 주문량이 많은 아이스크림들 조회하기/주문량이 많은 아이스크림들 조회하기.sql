-- 코드를 입력하세요
SELECT
    B.flavor
FROM (
    SELECT
        flavor,
        sum(total_order) AS total_order
    FROM july
    group by flavor
     ) A
RIGHT JOIN first_half AS B
ON A.flavor = B.flavor
ORDER BY (B.total_order + A.total_order) DESC
LIMIT 3