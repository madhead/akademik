ARG JAVA=11

FROM openjdk:${JAVA}
ADD build/distributions/akademik.tar /opt
ENTRYPOINT /opt/akademik/bin/akademik

LABEL org.opencontainers.image.source='https://github.com/madhead/akademik'
