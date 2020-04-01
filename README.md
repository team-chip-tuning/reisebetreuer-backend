# reisebetreuer-backend
Smart Watch Reisebetreuer Backend

### Cluster Setup Commands
```bash
# setup cluster
gcloud services enable compute.googleapis.com container.googleapis.com
gcloud container clusters create reisebetreuer \
  --num-nodes 1 \
  --machine-type n1-standard-1 \
  --zone europe-west6

#local setup for gcloud cli
gcloud services enable containerregistry.googleapis.com
gcloud auth configure-docker

# project id on gcp
reisebetreuer-backend

# tag image [zone][project-id][image-name]
docker tag reisebetreuer-backend:v0.0.1 eu.gcr.io/reisebetreuer-backend/backend:v0.0.1

# push to gcp register
docker push eu.gcr.io/reisebetreuer-backend/backend:v0.0.1

# list of images
gcloud container images list-tags eu.gcr.io/reisebetreuer-backend/backend

# deploye and create loadbalancer
kubectl create deployment backend --image=eu.gcr.io/reisebetreuer-backend/backend:v0.0.1
kubectl get pods
kubectl create service loadbalancer backend --tcp=8080:8080
```

## Build Status actions
![Java CI with Maven](https://github.com/team-chip-tuning/reisebetreuer-backend/workflows/Java%20CI%20with%20Maven/badge.svg)
[![Build Status](https://travis-ci.org/team-chip-tuning/reisebetreuer-backend.svg?branch=master)](https://travis-ci.org/team-chip-tuning/reisebetreuer-backend)

## OpenAPI
This is version 1 api for reisebetreuer-backen
Description REST-Endpoint, 

```bash
local : http://localhost:8080/api/v1/swagger-ui.html
cluster: 34.65.191.195:8080/api/v1/swagger-ui.html
```
