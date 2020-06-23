package ca.levimiller.data.transformer.matrix;

import ca.levimiller.data.db.ChatUserRepository;
import ca.levimiller.data.model.ChatUser;
import ca.levimiller.data.model.Contact;
import ca.levimiller.data.transformer.qualifiers.From;
import ca.levimiller.data.transformer.TransformationException;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component
public class MatrixContactTransformer {

  private final ChatUserRepository chatUserRepository;

  @Inject
  public MatrixContactTransformer(ChatUserRepository chatUserRepository) {
    this.chatUserRepository = chatUserRepository;
  }

  /**
   * Transforms a matrix user id to a Contact with a phone number.
   *
   * @param sender - matrix user id
   * @return - phone number linked to matrix user.
   * @throws TransformationException if there is no linked number.
   */
  @From
  public Contact transformFrom(String sender) throws TransformationException {
    return chatUserRepository.findDistinctByOwnerId(sender)
        .map(ChatUser::getContact)
        .orElseThrow(() -> new TransformationException(
            "Message sender isn't linked to a number: " + sender));
  }
}
