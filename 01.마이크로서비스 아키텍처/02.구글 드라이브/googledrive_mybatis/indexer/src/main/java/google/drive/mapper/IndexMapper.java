package google.drive.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import google.drive.dto.entity.Index;

@Mapper
public interface IndexMapper{
    public List<Index> findList();

    public Index findOneById(Long id);

    public void save(Index index);

    public void update(Index index);

    public void deleteById(Long id);
} 