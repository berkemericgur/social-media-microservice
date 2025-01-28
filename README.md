<h1 align="center" id="title">Social Media Microservice</h1>

<p align="center"><img src="https://socialify.git.ci/berkemericgur/social-media-microservice/image?font=Inter&amp;language=1&amp;name=1&amp;owner=1&amp;pattern=Charlie+Brown&amp;stargazers=1&amp;theme=Auto" alt="project-image"></p>

<p id="description">Bu proje mikroservis mimarilerine giriş yapmak ve temel prensiplerini anlamak amacıyla geliştirilmiş bir alıştırma uygulamasıdır. Projede sosyal medya uygulamasına benzer bir yapı ile kullanıcı yönetimi ve kimlik doğrulama işlemleri gerçekleştirilmektedir.</p>

  
  
<h2>🧐 Features</h2>

Here're some of the project's best features:

<h2>🛠️ Installation Steps:</h2>

<p>1. Depoyu Klonlayın:</p>

```
git clone https://github.com/berkemericgur/social-media-microservice.git cd social-media-microservice
```

<p>2. Her bir mikroservis için bağımlılıkları yükleyin ve çalıştırın: Her mikroservisi ayrı bir terminal penceresinde çalıştırmanız önerilir.</p>

```
cd AuthMicroservice ./gradlew build java -jar build/libs/AuthMicroservice.jar
```

<p>3. Docker Kullanarak Çalıştırma: Eğer Docker kullanıyorsanız projenin kök dizininde aşağıdaki komutu çalıştırarak tüm mikroservisleri başlatabilirsiniz:</p>

```
docker-compose up --build
```

  
  
<h2>💻 Built with</h2>

Technologies used in the project:

*   Java
*   Spring Boot
*   Spring Cloud Config
*   Gradle
*   Docker
