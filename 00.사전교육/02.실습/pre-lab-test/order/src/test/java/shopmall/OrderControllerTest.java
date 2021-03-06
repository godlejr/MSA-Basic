package shopmall;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@EmbeddedKafka // 테스트시 kafka 를 테스트용으로 돌리기 위하여 필요
@ActiveProfiles("test")  // kafka 를 테스트 용으로 돌리기 위해서는 EmbeddedKafka 주소필요
class OrderControllerTest {

    @Test
    public void testSomething(){
        assertThat(true);
    }

}