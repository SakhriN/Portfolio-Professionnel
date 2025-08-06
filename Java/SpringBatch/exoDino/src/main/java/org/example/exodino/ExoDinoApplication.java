package org.example.exodino;

import org.example.exodino.config.BatchConfig;
import org.example.exodino.entity.Dinosaure;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.PlatformTransactionManager;

@SpringBootApplication
public class ExoDinoApplication {
    private final JobLauncher jobLauncher;
    private final Job importJob;

    public ExoDinoApplication(JobLauncher joblauncher, Job importJob) {
        this.jobLauncher = joblauncher;
        this.importJob = importJob;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExoDinoApplication.class, args);
    }

    @Scheduled(fixedRate = 20000)
    public void performJob() throws Exception{
        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("time",System.currentTimeMillis())
                .toJobParameters();
        jobLauncher.run(importJob,jobParameters);
    }
}
