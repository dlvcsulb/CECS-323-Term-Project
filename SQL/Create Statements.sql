CREATE TABLE Project (
    projectID VARCHAR (20) NOT NULL,
    projectName VARCHAR (50) NOT NULL,
    PRIMARY KEY (projectID)    
);

CREATE TABLE ScrumTeam (
    teamID VARCHAR (20) NOT NULL,
    teamName VARCHAR (50) NOT NULL,
    projectID VARCHAR (20) NOT NULL,
    FOREIGN KEY (projectID) REFERENCES Project (projectID),
    PRIMARY KEY (teamID)
);

CREATE TABLE Developer (
    employeeID VARCHAR (20) NOT NULL,
    empFirst VARCHAR (50) NOT NULL,
    empLast VARCHAR (50) NOT NULL,
    teamID VARCHAR (20) NOT NULL,
    projectID VARCHAR (20) NOT NULL,
    projectName VARCHAR (50) NOT NULL,
    FOREIGN KEY (teamID) REFERENCES ScrumTeam (teamID),
    FOREIGN KEY (projectID) REFERENCES Project (projectID),
    FOREIGN KEY (projectName) REFERENCES Project (projectName),
    PRIMARY KEY (employeeID)
);

CREATE TABLE StakeHolder(
    stakeHolderID VARCHAR (20) NOT NULL,
    shFirst VARCHAR(50) NOT NULL,
    shLast VARCHAR(50) NOT NULL,
    shType VARCHAR(20) NOT NULL
    projectID VARCHAR(20) NOT NULL,
    FOREIGN KEY (projectID) REFERENCES Project (projectID),
    PRIMARY KEY (stakeHolderID)
);

CREATE TABLE Role (
    employeeID VARCHAR(20) NOT NULL,
    teamName VARCHAR (50) NOT NULL,
    roleType VARCHAR (20) NOT NULL,
    FOREIGN KEY (employeeID) REFERENCES Developer (employeeID),
    FOREIGN KEY (teamName) REFERENCES ScrumTeam (teamName),
    PRIMARY KEY (employeeID, teamName)
);

CREATE TABLE Sprints (
    sprintID VARCHAR (20) NOT NULL,
    projectID VARCHAR (20) NOT NULL,
    sprintIteration VARCHAR (20) NOT NULL,
    startDate DATE NOT NULL,
    endDate DATE NOT NULL,
    completion BOOLEAN NOT NULL,
    userStory VARCHAR (255) NOT NULL,
    projectName VARCHAR (50) NOT NULL,
    FOREIGN KEY (projectID) REFERENCES Project (projectID),
    PRIMARY KEY (sprintID)
);

CREATE TABLE SprintMembers(
    employeeID VARCHAR (20) NOT NULL,
    sprintID VARCHAR (20) NOT NULL,

CREATE TABLE SprintBacklog(
    storyID VARCHAR(50) NOT NULL,
    projectID VARCHAR() NOT NULL,
    assignedDeveloper VARCHAR() NOT NULL,
    sprintID VARCHAR() NOT NULL    
    FOREIGN KEY (sprintID) REFERENCES Sprints(SprintID),
    FOREIGN KEY (projectID) REFERENCES Project (projectID),
    PRIMARY KEY (storyID, projectID)
);

CREATE TABLE UserStory (
    storyID VARCHAR (20) NOT NULL,
    perspective VARCHAR (20) NOT NULL,
    request VARCHAR (50) NOT NULL,
    benefit VARCHAR (50) NOT NULL,
    priority VARCHAR (10) NOTNULL,
    FOREIGN KEY (storyID) REFERENCES SprintBacklog (storyID),
    PRIMARY KEY (storyID) ??
);
