-- # Write your MySQL query statement below
-- select e.id, e.email from person e
-- join person p on e.id = p.id
-- group by email having e.id < p.id;

# Write your MySQL query statement below
delete e2
from person e1
join person e2
on e1.email=e2.email
and e2.id>e1.id;