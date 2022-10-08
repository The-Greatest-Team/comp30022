# comp30022
This is the repo for comp30022 IT Project, Team 029 -- The Greatest Team

Team member:
| Name | StudentId | E-mail |
| ------ | ------ | ------ |
| Zizhou Zhang | 1081164 | zizhzhang@student.unimelb.edu.au |
| Yu Hin Li | 1182969 | yuhinl@student.unimelb.edu.au|
| Min Shen | 1132320 | msshe1@student.unimelb.edu.au |
| Wendi YING | 1135843 | wyying@student.unimelb.edu.au|
| Yichen Zhan | 1124601 | yiczhan@student.unimelb.edu.au |

## Tech

- WeChat - Communication
- Confluence - Documentation
- Jira - Task Management
- Draw.io - Software design
- Adobe XD - Prototyping
- React - Font-end
- Spring Boot - Back-end
- GitHub - Version Control
- Testing - JUnit/ Spring Framework Testing  
- Heroku - Deployment

## How to start the app?
1) open the whole project with IntelliJ IDEA, go to BackEnd/src/main/java/com/thegreatestteam/backend/BackEndApplication to run the main function, if SpringApplication is unrecognised, check "BackEnd Maven instruction" below to recognised it.
2) open the react-frontend file with Vscode(other tools with terminal also fine), if it's first time run, run 'npm install' to install all the dependency first(if see few warning with word 'deprecated', it's fine to continue, this is because the version we choosed is bit old, we considering to change to a newer version in next few sprint, but for now, all the function works fine with this a bit old version), then run 'npm start run' to run the project, the web app is using localhost:3000, the route of each page is define in the App.js.

### BackEnd Maven instruction (Brian)

If SpringApplication is unrecognised, navigate to the backend folder and rightclick "pom.xml", 
select "add as Maven Project". Then right click again the pom.xml and select Maven --> Reload Project

### Mongo DB
Username: thegreatestteam
password: VzI1YYho9OUMlj6R


## Userful Tips:
1. Kill port (bash terminal), replace [portNumber] with the portnumber you want to kill:
```
kill $(lsof -t -i:[portNumber])
```