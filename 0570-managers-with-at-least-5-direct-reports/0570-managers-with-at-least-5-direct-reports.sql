# Write your MySQL query statement below
/*/*here we need to select manager such that they have atlet 5 employee that are 
reporting  to them*/

select e.name as name 
from Employee e
join Employee e2 on e.id=e2.managerId 
group by e2.managerId
having count(e.id)>=5;