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

$ minukube dashboard


## Kubernetes
Here we will find how to let Kubernetes takes care of the bootified image we've created in previous steps.
https://kubernetes.io/docs/tutorials/hello-minikube/

$ eval $(minikube docker-env)

$ kubectl create deployment hello-node --image=microplus-microservice-hello

$ kubectl get deployments

$ kubectl get pods

$ kubectl get events

$ kubectl config view

$ kubectl expose deployment microplus-hello --type=LoadBalancer --port=8080

service/microplus-hello exposed
Amirs-MBP:hello amirsedighi$ minikube service microplus-hello
|-----------|-----------------|-------------|-----------------------------|
| NAMESPACE |      NAME       | TARGET PORT |             URL             |
|-----------|-----------------|-------------|-----------------------------|
| default   | microplus-hello |        8080 | http://192.168.99.117:30673 |
|-----------|-----------------|-------------|-----------------------------|
🎉  Opening service default/microplus-hello in default browser...


