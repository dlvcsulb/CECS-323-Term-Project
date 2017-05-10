create table Developer
(
	employeeID varchar(20) not null
		primary key,
	empFirst varchar(50) not null,
	empLast varchar(50) not null,
	teamID varchar(20) not null,
	projectID varchar(20) not null
)
;

create index projectID
	on Developer (projectID)
;

create index teamID
	on Developer (teamID)
;

create table Project
(
	projectName varchar(50) not null,
	projectID varchar(20) not null
		primary key
)
;

alter table Developer
	add constraint Developer_ibfk_2
		foreign key (projectID) references cecs323h29.Project (projectID)
;

create table Role
(
	employeeID varchar(20) not null,
	teamID varchar(20) not null,
	roleType varchar(20) not null,
	primary key (employeeID, teamID),
	constraint Role_ibfk_1
		foreign key (employeeID) references cecs323h29.Developer (employeeID)
)
;

create index teamID
	on Role (teamID)
;

create table ScrumTeam
(
	teamID varchar(20) not null
		primary key,
	teamName varchar(50) not null,
	projectID varchar(20) not null,
	constraint ScrumTeam_ibfk_1
		foreign key (projectID) references cecs323h29.Project (projectID)
)
;

create index projectID
	on ScrumTeam (projectID)
;

alter table Developer
	add constraint Developer_ibfk_1
		foreign key (teamID) references cecs323h29.ScrumTeam (teamID)
;

alter table Role
	add constraint Role_ibfk_2
		foreign key (teamID) references cecs323h29.ScrumTeam (teamID)
;

create table SprintBackLog
(
	storyID varchar(20) not null,
	projectID varchar(20) not null,
	assignedDeveloper varchar(255) not null,
	sprintID varchar(20) not null,
	primary key (storyID, projectID),
	constraint SprintBackLog_ibfk_2
		foreign key (projectID) references cecs323h29.Project (projectID)
)
;

create index projectID
	on SprintBackLog (projectID)
;

create index sprintID
	on SprintBackLog (sprintID)
;

create table SprintMembers
(
	employeeID varchar(20) not null,
	sprintID varchar(20) not null,
	constraint SprintMembers_ibfk_1
		foreign key (employeeID) references cecs323h29.Developer (employeeID)
)
;

create index employeeID
	on SprintMembers (employeeID)
;

create index sprintID
	on SprintMembers (sprintID)
;

create table Sprints
(
	sprintID varchar(20) not null
		primary key,
	projectID varchar(20) not null,
	sprintIteration varchar(20) not null,
	startDate date not null,
	endDate date not null,
	completion tinyint(1) not null,
	userStory varchar(255) not null,
	projectName varchar(50) not null,
	constraint Sprints_ibfk_1
		foreign key (projectID) references cecs323h29.Project (projectID)
)
;

create index projectID
	on Sprints (projectID)
;

alter table SprintBackLog
	add constraint SprintBackLog_ibfk_1
		foreign key (sprintID) references cecs323h29.Sprints (sprintID)
;

alter table SprintMembers
	add constraint SprintMembers_ibfk_2
		foreign key (sprintID) references cecs323h29.Sprints (sprintID)
;

create table StakeHolder
(
	stakeHolderID varchar(20) not null
		primary key,
	shFirst varchar(50) not null,
	shLast varchar(50) not null,
	shType varchar(20) not null,
	projectID varchar(20) not null,
	constraint StakeHolder_ibfk_1
		foreign key (projectID) references cecs323h29.Project (projectID)
)
;

create index projectID
	on StakeHolder (projectID)
;

create table UserStory
(
	storyID varchar(20) not null,
	perspective varchar(20) not null,
	request varchar(50) not null,
	benefit varchar(50) not null,
	priority varchar(10) not null,
	primary key (storyID, perspective, priority),
	constraint UserStory_ibfk_1
		foreign key (storyID) references cecs323h29.SprintBackLog (storyID)
)
;