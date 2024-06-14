package ca.group06.inventoryservice.bootstrap;

import ca.group06.inventoryservice.model.Batch;
import ca.group06.inventoryservice.model.Type;
import ca.group06.inventoryservice.repository.BatchRepository;
import ca.group06.inventoryservice.repository.TypeRepository;
import ca.group06.inventoryservice.service.TypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class BatchBootstrapper implements DevDataBootstrapper {

    private final BatchRepository batchRepository;
    private final TypeRepository typeRepository;
    private final TypeService typeService;

    public void bootstrap() {

        log.info("Bootstrapping batches");

        Type cookiesType = typeRepository.findByName("Cookies").get();
        Type breadType = typeRepository.findByName("Bread").get();
        Type muffinsType = typeRepository.findByName("Muffins").get();
        Type sandwichesType = typeRepository.findByName("Sandwiches").get();

        Batch b1 = Batch.builder()
                .name("Chocolate cookie")
                .type(cookiesType)
                .quantity(5)
                .qrCodeId(UUID.randomUUID())
                .build();
        b1.setBestBefore(b1.getCreatedAt().plusDays(cookiesType.getStoreDays()));

        Batch b2 = Batch.builder()
                .name("White bread")
                .type(breadType)
                .quantity(1)
                .createdAt(LocalDate.of(2024,2,1))
                .qrCodeId(UUID.randomUUID())
                .build();
        b2.setBestBefore(b2.getCreatedAt().plusDays(breadType.getStoreDays()));

        Batch b21 = Batch.builder()
                .name("White bread")
                .type(breadType)
                .quantity(1)
                .createdAt(LocalDate.of(2024,2,2))
                .qrCodeId(UUID.randomUUID())
                .build();
        b21.setBestBefore(b21.getCreatedAt().plusDays(breadType.getStoreDays()));

        Batch b22 = Batch.builder()
                .name("White bread")
                .type(breadType)
                .quantity(1)
                .createdAt(LocalDate.of(2024,2,3))
                .qrCodeId(UUID.randomUUID())
                .build();
        b22.setBestBefore(b22.getCreatedAt().plusDays(breadType.getStoreDays()));

        Batch b3 = Batch.builder()
                .name("Blueberry muffin")
                .type(muffinsType)
                .quantity(13)
                .createdAt(LocalDate.of(2024,2,3))
                .qrCodeId(UUID.randomUUID())
                .build();
        b3.setBestBefore(b3.getCreatedAt().plusDays(muffinsType.getStoreDays()));

        Batch b31 = Batch.builder()
                .name("Blueberry muffin")
                .type(muffinsType)
                .quantity(20)
                .createdAt(LocalDate.of(2024,2,5))
                .qrCodeId(UUID.randomUUID())
                .build();
        b31.setBestBefore(b31.getCreatedAt().plusDays(muffinsType.getStoreDays()));

        Batch b4 = Batch.builder()
                .name("Tuna sandwich")
                .type(sandwichesType)
                .quantity(5)
                .qrCodeId(UUID.randomUUID())
                .build();
        b4.setBestBefore(b4.getCreatedAt().plusDays(sandwichesType.getStoreDays()));

        batchRepository.saveAll(List.of(b1, b2, b21, b22, b3, b31, b4));
        log.info("Batches bootstrapping done");
    }
}
