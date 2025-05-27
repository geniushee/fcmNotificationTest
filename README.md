# FCM test를 위한 프로젝트
아주 아주 간단한 Firebase Cloud Messaging 테스트 프로젝트이다.

---
FCM을 테스트하기 위한 목적의 프로젝트입니다. 본 레포지토리에는 서버에 대한 코드만 있습니다.

## 개요
웹 애플리케이션은 Firebase에서 제공하는 [샘플 프로젝트](https://github.com/firebase/quickstart-java)를 사용했습니다.<br>
서버는 스프링으로 구현되어 있으며, local에서 간단하게 FCM을 맛보기 위한 프로젝트입니다.<br>
구성은 Config, Controller, Service로 구성되어 있습니다.<br>

### Config
Firebase설정을 위한 클래스
### Controller
Firebase에서 받은 토큰을 획득하고, 알림을 보내기 위한 API
### Service
Token을 저장하고 Firebase에 알림을 보내기 위한 서비스 구현체
