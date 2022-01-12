create or replace procedure find_employee_bonus ( employeeNo in number, empployeeName out varchar2, bonus out number) is

temp number(10,2);

begin
	select ename into employeeName from emp where empno = employeeNo;
	select sal into temp from emp where empno = employeeNo;
	
if temp <= 1000 then
	bonus := temp*0.20;
else
	bonuse := temp*0.20;
end if;
end;
/