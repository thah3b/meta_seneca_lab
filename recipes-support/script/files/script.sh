#!/bin/bash
gst-launch-1.0 v4l2src device=/dev/video0 ! videoconvert ! x264enc ! rtph264pay ! udpsink host=192.168.2.169 port=5000 sync=false async=false

