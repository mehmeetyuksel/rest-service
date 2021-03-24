# rest-service

curl -X POST -H 'Content-Type:application/json' -d '{"name":"mehmet","age":"22"}' http://localhost:8080/alert
komutuyla yazdırmayı denedim fakat hata aldım.



<br><br>


<i><h3>for building: </h3></i> <br>
docker build -t rest-service .

<i><h3>for run: </h3></i> <br>
docker run -p 8080:8080 rest-service
