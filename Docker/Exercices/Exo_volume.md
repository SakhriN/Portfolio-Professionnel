

Creation d'un projet avec apache .

```
docker run -v volumine:/usr/local/apache2/htdocs  --name projet-apache -p 2103:80 -d httpd
```
execution au projet :

```
docker exec -it projet-apache /bin/bash
```


Ajout des paramètres de base dont le test.txt 

```
cd htdocs
apt upgrade
apt update
apt install nano 
nano test.txt
```


Oups le patron s'est trompé et veut maintenant que nous passons a nginx donc je dois mettre le site web dans un autre projet avec apache.

Donc creation d'un autre projet avec nginx

```
docker run -v volumine:/usr/share/nginx/html  --name projet-nginx -p 2104:80 -d nginx
```

Verification si il y'a le test.txt dans le dossier html de nginx : 

```
cd /usr/share/nginx/html
apt upgrade
apt update
apt install nano 
nano test.txt
```