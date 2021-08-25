package com.example;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Version;
import java.time.Instant;
import java.util.UUID;

@MappedEntity(value = "DUMMY")
public class DummyEntity {
    @Id
    private UUID id;
    @Version
    private Instant lastModified;
    private String name;

    public DummyEntity() {
    }

    public DummyEntity(UUID id, Instant lastModified, String name) {
        this.id = id;
        this.lastModified = lastModified;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DummyEntity that = (DummyEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (lastModified != null ? !lastModified.equals(that.lastModified) : that.lastModified != null) {
            return false;
        }
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lastModified != null ? lastModified.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DummyEntity{" +
            "id=" + id +
            ", lastModified=" + lastModified +
            ", name='" + name + '\'' +
            '}';
    }
}
