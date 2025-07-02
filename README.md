# experiment/02-spring-i18n

## 프로젝트 설명

Spring Boot의 `MessageSource`와 `Locale`구조를 이용해 언어가 다른 사용자에게 하드코드된 코드를 복사하지 않고, 하나의 템플릿으로 다국어를 지원하는 i18n 구조를 구현하는 실험.

---

## 구현 방식

* `messages_ko.properties`, `messages_en.properties` 메시지 파일 생성
* `application.yml` 등에 i18n 설정
* `WebConfig` 클래스에 `LocaleResolver`, `LocaleChangeInterceptor` 구성
* `/write?lang=ko` 또는 `/write?lang=en`과 같은 건드로 한 템플릿을 언어별로 다국어 표시
* Thymeleaf에서 `#{key}` 형식으로 메시지 출력

---

## 가장 기본적인 데이터

* `/write` 건드

  * 제목 (`form.title`)
  * 내용 (`form.content`)
  * 등록 버튼 (`form.submit`)

---

## 테스트 방법

| 건드               | 결과                |
| ---------------- | ----------------- |
| `/write`         | 기본 (ko) 구조로 화면 표시 |
| `/write?lang=en` | 영어 화면             |
| `/write?lang=ko` | 한국어 화면            |

---

## 느낀 점
* 코드를 복사하지 않고, 목적에 따라 목숭 파일을 추가하면 되기 때문에 유지보수 및 확장성이 훨장 좋음
* 각 목적의 리소스가 최소화되어 바꾸기, 텍스트 수정에 해당이 적음
---

