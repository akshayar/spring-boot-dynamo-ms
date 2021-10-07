 export SERVICE_NAME=important-service
 export REGION=us-east-1
 docker build . -f Dockerfile -t $SERVICE_NAME
 docker tag $SERVICE_NAME:latest 799223504601.dkr.ecr.$REGION.amazonaws.com/$SERVICE_NAME:latest
 docker push 799223504601.dkr.ecr.$REGION.amazonaws.com/$SERVICE_NAME:latest
