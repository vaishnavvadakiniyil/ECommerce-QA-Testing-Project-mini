# JMeter Performance Testing - Product API

## Project Overview

This project demonstrates Performance Testing of a Product API using Apache JMeter.

The API tested:

http://localhost:3000/products

The objective was to measure API performance under different user loads and analyze response times, throughput, and error rates.

## Tools Used

* Apache JMeter
* JSON Server
* Java
* GitHub

## Test Scenario

API Endpoint:

GET /products

Base URL:

http://localhost:3000

## Test Configurations

### Test Run 1

* Users: 10
* Ramp-Up Period: 5 seconds
* Loop Count: 5

### Test Run 2

* Users: 50
* Ramp-Up Period: 10 seconds
* Loop Count: 5

### Test Run 3

* Users: 100
* Ramp-Up Period: 20 seconds
* Loop Count: 5

## Performance Results

| Users | Requests               | Average Response Time | Error % | Throughput |
| ----- | ---------------------- | --------------------- | ------- | ---------- |
| 10    | 50                     | 5 ms                  | 0%      | 11.6/sec   |
| 50    | 250                    | 5 ms                  | 0%      | 25.5/sec |
| 100   | 500                    | 5 ms                  | 0%      | 25.2/sec   |

## JMeter Components Used

* Test Plan
* Thread Group
* HTTP Request Sampler
* View Results Tree
* Summary Report

## Project Structure

JMeter-Performance

├── ProductAPI_LoadTest.jmx

├── README.md

└── Screenshots

```
├── 10_users_summary.png

├── 50_users_summary.png

└── 100_users_summary.png
```

## Outcome

Successfully executed load testing on Product API using Apache JMeter and analyzed application performance under multiple user loads.

## Author

Vaishnav V
