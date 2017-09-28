/**
 * Created by t00196165 on 28/09/2017.
 */
public class Message
{

    private String Message = "", Sender, Recip;

    public void setRecip(String recip)
        {
            this.Recip = recip;
        }

    public void setSender(String Sender)
    {
        this.Sender = Sender;
    }

    public void setMessage(String Message)
    {
        this.Message = Message;
    }

    public String getSender()
    {
        return Sender;
    }

    public String getMessage() {
        return Message;
    }

    public String getRecip() {
        return Recip;
    }

    public String append()
    {
        String message;
        message = "\nMessage: " + getMessage();
        return message;
    }

    public String toString()
    {
        return "From: " + getSender() + "\nTo: " + getRecip() + append();
    }

    public Message(String Sender, String Recip)
    {
        setSender(Sender);
        setRecip(Recip);
        setMessage("Unknown");
    }

}
