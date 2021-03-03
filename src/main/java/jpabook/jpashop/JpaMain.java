package jpabook.jpashop;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Order order = new Order();
            order.addOrderItem(new OrderItem());
            System.out.println("1-------------------------------");


            System.out.println("1-----1111111111111--------------------------");
            System.out.println("1-------------------------------");
            System.out.println("1-----1111111111111--------------------------");

            tx.commit();
        } catch (Exception ex) {
            tx.rollback();

        } finally {
            em.close();
            emf.close();
        }
    }
}
