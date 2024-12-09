# base image is openjdk to run java app
FROM openjdk

WORKDIR /app

COPY abdelhameed.java .
#COPY C:\Users\user\Desktop\mohamed\abdelhameed.class .
RUN javac abdelhameed.java

CMD [ "java" , "abdelhameed" ]
