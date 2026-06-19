# Write your MySQL query statement below
# Write your MySQL query statement below
select w1.id
from Weather  w1
join weather w2
on w1.recorddate=Date_Add(w2.recorddate,interval 1 day)
where   w1.temperature > w2.temperature;