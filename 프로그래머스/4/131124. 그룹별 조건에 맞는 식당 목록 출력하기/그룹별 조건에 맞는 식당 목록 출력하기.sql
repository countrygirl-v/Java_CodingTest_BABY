-- 코드를 입력하세요
select m.member_name, r.review_text, date_format(r.review_date, '%Y-%m-%d')
from member_profile m, rest_review r
where m.member_id = r.member_id 
and m.member_id in (select r.member_id
                    from rest_review r
                    group by r.member_id
                    having count(*) = (
                        select max(cnt)
                        from (select member_id, count(*) cnt
                            from rest_review
                            group by member_id) as reviewCounts
                    ))
order by review_date, review_text