FROM openjdk:11
ADD build/distributions/akademik.tar /opt
ENTRYPOINT /opt/akademik/bin/akademik
