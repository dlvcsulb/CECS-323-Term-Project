INSERT INTO Project(projectID, projectName) VALUES('00001', 'Alpha');
INSERT INTO Project(projectID, projectName) VALUES('00002', 'Beta');
INSERT INTO Project(projectID, projectName) VALUES('00003', 'Gamma');
INSERT INTO Project(projectID, projectName) VALUES('00004', 'Delta');
INSERT INTO Project(projectID, projectName) VALUES('00005', 'Epsilon');
INSERT INTO Project(projectID, projectName) VALUES('00006', 'Zeta');
INSERT INTO Project(projectID, projectName) VALUES('00007', 'Eta');
INSERT INTO Project(projectID, projectName) VALUES('00008', 'Theta');
INSERT INTO Project(projectID, projectName) VALUES('00009', 'Iota');
INSERT INTO Project(projectID, projectName) VALUES('00010', 'Kappa');
INSERT INTO Project(projectID, projectName) VALUES('00011', 'Lambda');
INSERT INTO Project(projectID, projectName) VALUES('00012', 'Mu');
INSERT INTO Project(projectID, projectName) VALUES('00013', 'Nu');

INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10001','Apple', '00001');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10002','Banana', '00002');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10003','Carrot', '00003');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10004','Deer', '00004');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10005','Elephant', '00005');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10006','Ferret', '00006');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10007','Gorilla', '00007');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10008','Hawk', '00008');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10009','Insect', '00009');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10010','Jellyfish', '00010');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10011','King', '00011');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10012','Lion', '00012');
INSERT INTO ScrumTeam(teamID, teamName, projectID) VALUES('10013','Monkey', '00013');


INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20001', 'Lisa', 'McCauley', '10001', '00001');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20002', 'Evita', 'Guzman', '10002', '00002');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20003', 'Anthony', 'Kim', '10003', '00003');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20004', 'Diana', 'Calungcagin', '10004', '00004');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20005', 'Brady', 'Tang', '10005', '00005');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20006', 'Bernadette', 'Asuncion', '10006', '00006');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20007', 'Annie', 'Wang', '10007', '00007');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20008', 'Bonnie', 'Clyde', '10008', '00008');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20009', 'Caroline', 'Nguyen', '10009', '00009');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20010', 'Danou', 'Veasna', '10010', '00010');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20011', 'Vernon', 'Benedicto', '10011', '00011');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20012', 'Caleb', 'Quiatchon', '10012', '00012');
INSERT INTO Developer(employeeID,empFirst, empLast, teamID, projectID) VALUES ('20013', 'Jessie', 'Lo', '10013', '00013');

INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00001', 'John', 'Wick', '.....', '20001');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00002', 'Adam', 'Wayne', '.....', '20002');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00003', 'Benjamin', 'Aston', '.....', '20003');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00004', 'Carol', 'Mayer', '.....', '20004');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00005', 'Genesis', 'Ocampo', '.....', '20005');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00006', 'Troy', 'Donaldson', '.....', '20006');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00007', 'Michelle', 'Tadena', '.....', '20007');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00008', 'Erica', 'Blundo', '.....', '20008');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00009', 'Yewande', 'Noah', '.....', '20009');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00010', 'Natasha', 'LeRutte', '.....', '20010');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00011', 'Kayla', 'Sapida', '.....', '20011');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00012', 'Gerald', 'Pahati', '.....', '20012');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('00013', 'Tom', 'Nguyen', '.....', '20013');

INSERT INTO Role(employeeID, teamID, roleType) VALUES('20001', '10001', 'Leader');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20002', '10002', 'Coder');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20003', '10003', 'Developer');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20004', '10004', 'Manager');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20005', '10005', 'Architect');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20006', '10006', 'Analyst');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20007', '10007', 'Designer');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20008', '10008', 'Programmer');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20009', '10009', 'Tester');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20010', '10010', 'Analyst');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20011', '10011', 'Designer');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20012', '10012', 'Programmer');
INSERT INTO Role(employeeID, teamID, roleType) VALUES('20013', '10013', 'Tester');

INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50001', '20001', '1', 'February 2, 2017', 'August 24, 2017', 'August 13, 2017', 'As a user, I want to be able to create a SCRUM process with a friendly user interface.', 'Alpha');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50002', '20002', '3', 'January 12, 2017', 'June 12, 2017', 'July 2, 2017', 'As a user, I want to be able to add a SCRUM team.', 'Beta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50003', '20003', '2', 'July 27, 2017', 'March 23, 2017', 'March 27, 2017', 'As a user, I want to be able to insert a start date.', 'Gamma');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50004', '20004', '1', 'October 22, 2017', 'November 23, 2017', 'November 20, 2017', 'As a user, I want to be able to insert an end date.', 'Delta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50005', '20005', '2', 'September 17, 2017', 'December 26, 2017', 'December 29, 2017', 'As a user, I want to be able to insert a completion date.', 'Epsilon');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50006', '20006', '2', 'December 21, 2017', 'May 1, 2017', 'July 1, 2017', 'As a user, I want to be able to insert the name of a project.', 'Zeta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50007', '20007', '3', 'November 30, 2017', 'March 30, 2017', 'February 25, 2017', 'As a user, I want to be able to add the developer working on the project.', 'Eta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50008', '20008', '1', 'March 5, 2017', 'April 7, 2017', 'April 1, 2017', 'As a user, I want to be able to add the stakeholders that are a part of the project.', 'Theta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50009', '20009', '3', 'May 10, 2017', 'October 15, 2017', 'October 17, 2017', 'As a user, I want to be able to add each individual roles that are a part of the SCRUM project.', 'Iota');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50010', '20010', '2', 'June 21, 2017', 'September 29, 2017', 'October 12, 2017', 'As a user, I want to be able to add a sprint that is going to be used for the project.', 'Kappa');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50011', '20011', '1', 'April 11, 2017', 'July 18, 2017', 'July 5, 2017', 'As a user, I want to be able to add the members that are assigned to each individual sprint.', 'Lambda');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50012', '20012', '3', 'August 29, 2017', 'January 6, 2017', 'January 10, 2017', 'As a user, I want to be able to add user stories to each individual projects.', 'Mu');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50013', '20013', '2', 'July 4, 2017', 'December 30, 2017', 'January 1, 2017', 'As a user, I want to be able to view a user story\'s benefit to the project.', 'Nu');

INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20001', '50001');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20002', '50002');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20003', '50003');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20004', '50004');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20005', '50005');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20006', '50006');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20007', '50007');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20008', '50008');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20009', '50009');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20010', '50010');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20011', '50011');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20012', '50012');
INSERT INTO SprintMembers(employeeID, sprintID) VALUES('20013', '50013');

INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80001', '20001', 'Evita Guzman', '50001');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80002', '20002', 'Bonnie Clyde', '50002');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80003', '20003', 'Annie Wang', '50003');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80004', '20004', 'Vernon Benedicto', '50004');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80005', '20005', 'Danou Veasna', '50005');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80006', '20006', 'Caleb Quiatchon', '50006');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80007', '20007', 'Bernadette Asuncion', '50007');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80008', '20008', 'Brady Tang', '50008');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80009', '20009', 'Caroline Nguyen', '50009');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80010', '20010', 'Jessie Lo', '50010');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80011', '20011', 'Lisa McCauley', '50011');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80012', '20012', 'Anthony Kim', '50012');
INSERT INTO SprintBacklog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80013', '20013', 'Diane Caluncagin', '50013');

INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80001', 'user', 'create a scrum process', 'simple interface', '8');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80002', 'user', 'add scrum team', 'organizable', '8');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80003', 'user', 'add start date', 'track of inception', '6');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80004', 'user', 'add end date', 'track of end', '6');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80005', 'user', 'add completion date', 'track of the actual date completed', '4');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80006', 'user', 'add name of project', 'differentiate the names of the project', '6');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80007', 'user', 'add developer to project', 'Keeps track of each projects developers', '4');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80008', 'user', 'add stakeholders to the project', 'Keeps track of investors', '6');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80009', 'user', 'add different roles in the project', 'Fills in the roles needed for the project', '8');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80010', 'user', 'add sprints to the project', 'Shows each individualized task at hand', '7');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80011', 'user', 'add members to each individual sprint', 'Shows whos in charge of what task', '7');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80012', 'user', 'add user stories to each project', 'Interaction between product and end user', '9');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80013', 'user', 'add the benefits of each user story', 'Displays what benefits each user prompt gives to the project', '9');






