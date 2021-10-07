 export SERVICE_NAME=less-important-service
  export REGION=us-west-2
 docker build . -f Dockerfile -t $SERVICE_NAME
 docker tag $SERVICE_NAME:latest public.ecr.aws/b5p5p7r6/$SERVICE_NAME:latest  
 docker push public.ecr.aws/b5p5p7r6/$SERVICE_NAME:latest
