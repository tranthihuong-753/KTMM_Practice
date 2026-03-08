# JMeter Performance Test – Reddit

## Website
https://www.reddit.com

## Công cụ
Apache JMeter

---

# Thread Group 1 – Basic Scenario

Users: 10  
Ramp-up: 10s  
Loop Count: 5  

Action:
GET /

Result:

- Response Time: ~5517 ms
- Throughput: ~1.29257 request/sec
- Error Rate: 55.257%

---

# Thread Group 2 – Heavy Load

Users: 50  
Ramp-up: 30s  

Action:

GET /  
GET /r/popular

Result:

- Response Time: ~5560 ms
- Throughput: ~1.46040 request/sec
- Error Rate: ~69.088%

Một số request trả về HTTP 429 (Too Many Requests) do Reddit áp dụng rate limiting.

---

# Thread Group 3 – Custom Scenario

Users: 20  
Duration: 60s  

Action:

GET /explore
GET /?feed=news

Result:

- Response Time: ~5535 ms
- Throughput: ~1.35230 request/sec
- Error Rate: ~67.414%

---