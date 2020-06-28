#!/usr/bin/bash


export IMAGE_GALLERY_BOOTSTRAP_VERSION="1.0"
aws s3 cp s3://edu.au.cc.kzw0068.image-gallery-config/ansible-ec2-prod-latest.sh ./
/usr/bin/bash ansible-ec2-prod-latest.sh

