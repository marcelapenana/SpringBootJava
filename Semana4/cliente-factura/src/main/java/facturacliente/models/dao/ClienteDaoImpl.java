package facturacliente.models.dao;

import facturacliente.models.entity.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ClienteDaoImpl implements IClienteDao{
    @PersistenceContext//define contexto de persistencia
    private EntityManager em;//clase entityManager utilixza codigo para hacer consultas bd, se relaciona con la entity
    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        //TODO Auto-generated method stub
        return em.createQuery("from Cliente").getResultList();
    }

    @Override
    @Transactional//afectare bd realizar commit direct
    public void save(Cliente cliente) {
         if (cliente.getId() !=null && cliente.getId()>0){
             em.merge(cliente);//merge por la transaccion, validación que el id exista y no sea nulo
         }else {
             em.persist(cliente);
         }
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(Long id) {
        return em.find(Cliente.class, id);
    }

    @Override
    public void delete(Long id) {
       em.remove(findOne(id));
    }
}
