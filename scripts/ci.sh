docker buildx build --tag=blednovrg/nextplease:latest --platform=linux/amd64 .
ssh roman@62.84.120.100 -i ./roman-cloud-ssh-rsa-key
ssh roman@130.61.131.92 -i ./roman-cloud-ssh-rsa-key
docker build --tag=blednovrg/nextplease:latest .