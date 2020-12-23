select * from player ;
select * from team;
select * from player where team_id =100;
select p.id , p.name, t.team_id ,t.team_name 
from  player p
join team t 
on p.team_id = t.team_id ;

select p.id , p.name, t.team_id ,t.team_name 
from  player p
left join team t 
on p.team_id = t.team_id ;

select p.id , p.name, t.team_id ,t.team_name 
from  player p
right join team t 
on p.team_id = t.team_id ;

select p.id , p.name, t.team_id ,t.team_name 
from  player p
inner join team t 
on p.team_id = t.team_id ;