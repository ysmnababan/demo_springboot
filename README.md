## How to Run
### Prerequisites
Make sure you already installed this dependency on you machine:
- [Docker](https://docs.docker.com/engine/install/) : to run dependency environment such as database and redis (skip if you want to run it not virtually)
- [Docker Compose](https://docs.docker.com/compose/install/) : to run dependency environment such as database and redis (skip if you want to run it not virtually)
- Java 17
- you can install globally, or
- install locally in project directory by:
	- using your IDE such as Intellij, or
	- [jenv](https://github.com/jenv/jenv)

### Steps to Run
- Run database using `docker-compose up -d postgres` (skip if you already have it locally)
- Run database migration (more about [flyway](https://documentation.red-gate.com/fd/redgate-flyway-documentation-138346877.html))
- Using CLI: `./gradlew flywayMigrate`
- Using IDE Intellij
	- Open gradle command portal
	- Choose and run `flyway > flywayMigrate`
- Run the app
- Using IDE Intellij run application command
	- Go to `LearnApplication` class, and click play button
