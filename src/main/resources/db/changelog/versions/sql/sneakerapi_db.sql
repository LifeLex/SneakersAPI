drop database sneakerapidb;
drop user sneakerapi;
create user sneakerapi with password 'postgres';
create database sneakerapidb with template=template0 owner=sneakerapi;
\connect sneakerapidb;
alter default privileges grant all on tables to sneakerapi;
alter default privileges grant all on sequences to sneakerapi;
