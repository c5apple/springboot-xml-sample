# springboot-xml-sample
SpringBootでXMLを使用するサンプル

## POST

```
$ curl -i -H "Accept: application/json" \
       -d "integer=1" \
       -d "string=aaa" \
       -d "strings=AAA1" -d "strings=AAA2" -d "strings=AAA3" \
       http://localhost:8080/sample

Location: http://localhost:8080/sample/1
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 17 Feb 2020 04:07:57 GMT

{"integer":1,"string":"aaa","strings":["AAA1","AAA2","AAA3"]}
```

```
$ curl -i -H "Accept: application/xml" \
       -d "integer=2" \
       -d "string=bbb" \
       -d "strings=BBB1" -d "strings=BBB2" -d "strings=BBB3" \
       http://localhost:8080/sample

Location: http://localhost:8080/sample/2
Content-Type: application/xml
Transfer-Encoding: chunked
Date: Mon, 17 Feb 2020 04:08:37 GMT

<?xml version="1.0" encoding="UTF-8" standalone="yes"?><sampleResource><integer>2</integer><string>bbb</string><strings>BBB1</strings><strings>BBB2</strings><strings>BBB3</strings></sampleResource>
```

## GET

```
$ curl -i -H "Accept: application/json" http://localhost:8080/sample/1

Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 17 Feb 2020 04:09:08 GMT

{"integer":1,"string":"aaa","strings":["AAA1","AAA2","AAA3"]}
```

```
$ curl -i -H "Accept: application/xml" http://localhost:8080/sample/2

Content-Type: application/xml
Transfer-Encoding: chunked
Date: Mon, 17 Feb 2020 04:09:31 GMT

<?xml version="1.0" encoding="UTF-8" standalone="yes"?><sampleResource><integer>2</integer><string>bbb</string><strings>BBB1</strings><strings>BBB2</strings><strings>BBB3</strings></sampleResource>
```
