FROM alpine:latest

RUN apk update && apk upgrade --no-cache

RUN apk add apache2

EXPOSE 80

CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]

# docker run -d -p 8080:80 test