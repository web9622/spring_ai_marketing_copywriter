# ✍️ Spring AI 마케팅 카피라이터

## 💡 프로젝트 소개 (Introduction)

이 프로젝트는 $\text{Spring AI}$ 프레임워크와 대규모 언어 모델($\text{LLM}$)을 통합하여 **전문적인 마케팅 문구(Copywriting)를 자동으로 생성**하는 웹 애플리케이션입니다. 사용자 친화적인 인터페이스를 통해 제품 정보나 키워드를 입력하면, $\text{AI}$가 다양한 스타일과 목적에 맞는 홍보 문구를 즉시 생성해 줍니다.

이는 $\text{Spring Boot}$와 $\text{AI}$ 기술을 결합하여 기업의 데이터와 $\text{API}$를 $\text{AI}$ 모델에 연결하는 $\text{AI}$ 엔지니어링의 기본 원칙을 보여줍니다.

-----

## ✨ 주요 기능 (Features)

  * **마케팅 문구 생성:** 제품 이름, 특징, 대상 고객 등 키워드를 기반으로 홍보 문구를 생성합니다.
  * **$\text{Spring AI}$ 기반:** $\text{OpenAI}$($\text{GPT}$)를 포함한 다양한 $\text{LLM}$ 제공업체를 지원하는 $\text{Spring AI}$의 추상화된 $\text{API}$를 사용합니다.
  * **스트리밍 지원:** $\text{AI}$ 응답을 실시간으로 화면에 출력하는 스트리밍 기능을 구현합니다.
  * **웹 $\text{UI}$:** 사용자 질문을 입력하고 $\text{AI}$ 응답을 확인할 수 있는 간단한 웹 인터페이스를 제공합니다.

-----

## 💻 사용 기술 (Technologies)

| 분류 | 기술 | 역할 |
| :--- | :--- | :--- |
| **백엔드 프레임워크** | $\text{Spring Boot 3.x}$ | 애플리케이션 서버 구성 및 실행을 담당합니다. |
| **$\text{AI}$ 통합** | $\text{Spring AI}$ | $\text{LLM}$ 호출 및 응답 처리를 위한 핵심 $\text{API}$를 제공합니다. |
| **$\text{LLM}$ 제공업체** | $\text{OpenAI}$ ($\text{GPT}$ 모델) | 실제 마케팅 문구를 생성하는 대규모 언어 모델입니다. |
| **의존성 관리** | $\text{Gradle}$ | 프로젝트 빌드 및 종속성 관리에 사용됩니다. |
| **프론트엔드** | $\text{HTML}$, $\text{CSS}$, $\text{JavaScript}$ | 사용자 인터페이스($\text{UI}$) 및 비동기 $\text{API}$ 요청을 처리합니다. |

-----

## ⚙️ 설정 및 실행 (Setup & Run)

이 프로젝트를 로컬 환경에서 실행하기 위해서는 **$\text{OpenAI API Key}$** 설정이 필수입니다.

### 1\. $\text{OpenAI API Key}$ 설정

`src/main/resources/application.properties` 또는 `application.yml` 파일에 $\text{OpenAI API Key}$를 설정해야 합니다.

```properties
# application.properties 예시
spring.ai.openai.api-key=<YOUR_OPENAI_API_KEY>
```

### 2\. 프로젝트 빌드 및 실행

프로젝트 루트 디렉토리에서 $\text{Gradle}$을 사용하여 애플리케이션을 실행합니다.

```bash
# 터미널에서 실행
./gradlew bootRun
```

### 3\. 웹 접속

서버가 시작되면 웹 브라우저를 열어 다음 주소로 접속합니다 (기본 포트 $\text{8080}$ 기준).

```
http://localhost:8080/
```

-----

## 📝 기여 및 피드백 (Contributing)

이 프로젝트에 대한 개선 사항이나 피드백은 언제든지 환영합니다. $\text{Pull Request}$ 또는 $\text{Issue}$ 등록을 통해 참여해 주세요.

## 🧑‍💻 개발자 (Developer)

  * [@web9622](https://www.google.com/search?q=https://github.com/web9622)
