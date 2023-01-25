alter user hr identified by hr account unlock;

select * from dba_sys_privs where grantee = 'HR';

revoke create view from hr;

grant create view to hr;
