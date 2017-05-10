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

INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30001', 'John', 'Wick', '.....', '00001');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30002', 'Adam', 'Wayne', '.....', '00002');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30003', 'Benjamin', 'Aston', '.....', '00003');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30004', 'Carol', 'Mayer', '.....', '00004');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30005', 'Genesis', 'Ocampo', '.....', '00005');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30006', 'Troy', 'Donaldson', '.....', '00006');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30007', 'Michelle', 'Tadena', '.....', '00007');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30008', 'Erica', 'Blundo', '.....', '00008');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30009', 'Yewande', 'Noah', '.....', '00009');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30010', 'Natasha', 'LeRutte', '.....', '00010');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30011', 'Kayla', 'Sapida', '.....', '00011');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30012', 'Gerald', 'Pahati', '.....', '00012');
INSERT INTO StakeHolder(stakeHolderID, shFirst, shLast, shType, projectID) VALUES('30013', 'Tom', 'Nguyen', '.....', '00013');

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

INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50001', '00001', '1', '2017-02-02', '2017-08-24', '2017-08-13', 'As a user, I want to be able to create a SCRUM process with a friendly user interface.', 'Alpha');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50002', '00002', '3', '2017-01-12', '2017-06-12', '2017-07-02', 'As a user, I want to be able to add a SCRUM team.', 'Beta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50003', '00003', '2', '2017-07-27', '2017-03-23', '2017-03-27', 'As a user, I want to be able to insert a start date.', 'Gamma');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50004', '00004', '1', '2017-10-22', '2017-11-23', '2017-11-20', 'As a user, I want to be able to insert an end date.', 'Delta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50005', '00005', '2', '2017-09-17', '2017-12-26', '2017-12-29', 'As a user, I want to be able to insert a completion date.', 'Epsilon');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50006', '00006', '2', '2017-01-27', '2017-03-01', '2017-02-25', 'As a user, I want to be able to insert the name of a project.', 'Zeta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50007', '00007', '3', '2017-11-30', '2017-12-30', '2017-12-29', 'As a user, I want to be able to add the developer working on the project.', 'Eta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50008', '00008', '1', '2017-03-25', '2017-04-30', '2017-04-21', 'As a user, I want to be able to add the stakeholders that are a part of the project.', 'Theta');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50009', '00009', '3', '2017-05-06', '2017-07-15', '2017-06-30', 'As a user, I want to be able to add each individual roles that are a part of the SCRUM project.', 'Iota');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50010', '00010', '2', '2017-10-21', '2017-11-30', '2017-11-25', 'As a user, I want to be able to add a sprint that is going to be used for the project.', 'Kappa');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50011', '00011', '1', '2017-02-06', '2017-04-01', '2017-03-25', 'As a user, I want to be able to add the members that are assigned to each individual sprint.', 'Lambda');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50012', '00012', '3', '2017-06-25', '2017-08-01', '2017-07-25', 'As a user, I want to be able to add user stories to each individual projects.', 'Mu');
INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userstory, projectName) VALUES('50013', '00013', '2', '2017-07-04', '2017-08-01', '2017-07-30', 'As a user, I want to be able to view a user story\'s benefit to the project.', 'Nu');

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

INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80001', '00001', 'Evita Guzman', '50001');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80002', '00002', 'Bonnie Clyde', '50002');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80003', '00003', 'Annie Wang', '50003');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80004', '00004', 'Vernon Benedicto', '50004');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80005', '00005', 'Danou Veasna', '50005');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80006', '00006', 'Caleb Quiatchon', '50006');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80007', '00007', 'Bernadette Asuncion', '50007');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80008', '00008', 'Brady Tang', '50008');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80009', '00009', 'Caroline Nguyen', '50009');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80010', '00010', 'Jessie Lo', '50010');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80011', '00011', 'Lisa McCauley', '50011');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80012', '00012', 'Anthony Kim', '50012');
INSERT INTO SprintBackLog(storyID, projectID, assignedDeveloper, sprintID) VALUES('80013', '00013', 'Diane Caluncagin', '50013');

INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80001', 'user', 'create a scrum process', 'simple interface', '8');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80002', 'developer', 'add scrum team', 'organizable', '8');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80003', 'manager', 'add start date', 'track of inception', '6');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80004', 'stakeholder', 'add end date', 'track of end', '6');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80005', 'user', 'add completion date', 'track of the actual date completed', '4');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80006', 'developer', 'add name of project', 'differentiate the names of the project', '6');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80007', 'manager', 'add developer to project', 'Keeps track of each projects developers', '4');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80008', 'stakeholder', 'add stakeholders to the project', 'Keeps track of investors', '6');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80009', 'user', 'add different roles in the project', 'Fills in the roles needed for the project', '8');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80010', 'developer', 'add sprints to the project', 'Shows each individualized task at hand', '7');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80011', 'manager', 'add members to each individual sprint', 'Shows who\'s in charge of what task', '7');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80012', 'stakeholder', 'add user stories to each project', 'Interaction between product and end user', '9');
INSERT INTO UserStory(storyID, perspective, request, benefit, priority) VALUES('80013', 'user', 'add the benefits of each user story', 'Displays what benefits each user', '9');