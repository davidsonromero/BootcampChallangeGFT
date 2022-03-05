package challange.bootcamps;

import challange.content.*;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        subscribedContents.addAll(bootcamp.getContents());
        bootcamp.subDevs.add(this);
    }

    public void advance() {
        Optional<Content> content = subscribedContents.stream().findFirst();
        if (content.isPresent()) {
            finishedContents.add(content.get());
            subscribedContents.remove(content.get());
        } else {
            System.err.println("Você não está inscrito neste conteúdo");
        }
    }

    public double calcTotalXp(){
        return this.finishedContents.stream().mapToDouble(content -> content.calcXP()).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }   

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
