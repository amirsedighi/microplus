# microplus
microPlus is a basic spring boot + docker + kubernetes based minimal infra code + configuration files

## Compile
$ mvn clean install

## Run by Maven
$ mvn spring-boot:run

## Run by Docker
$ docker run -p 5000:8080 microplus-microservice-hello


## Common Docker Commands

### Buildig Image
$ docker build -t microplus-microservice-hello .



## Common Kubernetes Commands

$ minikube status

$ minikube start

$ minikube stop





