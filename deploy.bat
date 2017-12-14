copy D:\Hackathon\demo\target\demo-0.0.1-SNAPSHOT.jar C:\springboot
kubectl delete services springboot
kubectl delete pods --all
kubectl delete deployment springboot
timeout /t 5
docker build -t springboot:v1 C:\springboot\
kubectl run springboot --image=springboot:v1 --port=8080
kubectl expose deployment springboot --type=LoadBalancer
timeout /t 5
minikube service springboot