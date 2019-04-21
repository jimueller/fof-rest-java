# fof-rest-java
Dropwizard restful service demo project

### Built with
- [Dropwizard 1.3.9](https://www.dropwizard.io/1.3.9/docs/)
- [JDBI3](http://jdbi.org/)

### Requires
- [Maven 3.5.2 or higher](https://maven.apache.org/) Required by [jmeter-maven-plugin 2.9.0](https://github.com/jmeter-maven-plugin/jmeter-maven-plugin)

### Setup

1. Clone project
1. Create Postgres (9.5+) database using included scripts
1. Configure Environment Variables

| Name          | Description                |
| ------------- | -------------------------- |
| DB_HOST       | Database hostname          |
| DB_PORT       | Database port              |
| DB_USER       | Database username          |
| DB_PASS       | Database password          |
| DS_NAME       | Database name              |
