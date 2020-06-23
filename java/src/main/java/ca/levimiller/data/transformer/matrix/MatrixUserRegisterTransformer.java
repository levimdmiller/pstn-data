package ca.levimiller.data.transformer.matrix;

import ca.levimiller.data.model.Contact;
import ca.levimiller.util.UuidSource;
import io.github.ma1uta.matrix.client.model.account.RegisterRequest;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component
public class MatrixUserRegisterTransformer {

  private final UuidSource uuidSource;

  @Inject
  protected MatrixUserRegisterTransformer(UuidSource uuidSource) {
    this.uuidSource = uuidSource;
  }

  /**
   * Transforms the Contact to a matrix user registration request.
   *
   * @param contact - contact to transform.
   * @return - matrix register user request
   */
  public RegisterRequest transform(Contact contact) {
    RegisterRequest registerRequest = new RegisterRequest();
    registerRequest.setUsername("sms-" + uuidSource.newUuid().toString());
    registerRequest.setInhibitLogin(true);
    return registerRequest;
  }
}
