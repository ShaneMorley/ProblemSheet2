
package vendingmachine;

public class MachineContents {
    
    private int tokens, cans;
    
    public void setCans(int cans)
    {
        this.cans = cans;
    }
    
    public void addCans(int cans)
    {
        this.cans += cans;
    }
    
    public void subCans(int cans)
    {
        this.cans -= cans;
    }
    public void setTokens(int tokens)
    {
        this.tokens += tokens;
    }
    
    public int getCans()
    {
        return cans;
    }
    
    public int getTokens()
    {
        return tokens;
    }
    
    public String toString()
    {
        String out = "Current Cans: " + getCans() + "\nTotal Tokens: " + getTokens();
        return out;
    }
    
    public MachineContents()
    {
        setCans(10);
        setTokens(0);
    }
    
}
