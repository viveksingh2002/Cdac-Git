# docker

## system

```bash

# get the system information
> docker system info

```

## images

```bash

# get the list of images
> docker image ls

# download an image from docker registry (docker hub)
# visit the docker hub at https://hub.docker.com
> docker image pull <image name>

# get the details of selected image
> docker image inspect <image name>

# delete a selected image
> docker image rm <image name>

```

## containers

```bash
# get the list of running containers
> docker container ls

# get the list of all containers
# state: created, running (Up), stopped (Exited)
> docker container ls -a

# create a container from an image
> docker container create <image name>

# start a container
> docker container start <container id or name>

# get the details of selected container
> docker container inspect <container id or name>

# stop a selected container
> docker container stop <container id or name>

# remove a selected (stopped) container
> docker container rm <container id or name>

# remove a running container
> docker container rm --force <container id or name>

# run a container in attached mode
# attached mode:
# - the container gets attached to the terminal from where it gets started
# - if the terminal stops, the container also stopped
# run = create + start
> docker container run <image name>

# run a container in detached mode
# -d: starts the container in detached mode (background)
> docker container run -d <image name>

# run a container in detached mode with a selected name
> docker container run -d --name <container name> <image name>
> docker container run -d --name myhttpd httpd

```


