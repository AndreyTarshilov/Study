package org.stepic.java.Lesson4_3.Sendable.src.sendable;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Message") ;

        Spy s1 = new Spy(logger);
        MailMessage m1 = new MailMessage(AUSTIN_POWERS, "End", AUSTIN_POWERS);


        MailMessage m2 = new MailMessage("Begin", AUSTIN_POWERS, AUSTIN_POWERS);
        MailMessage m3 = new MailMessage("Begin", "End", AUSTIN_POWERS);
        Package pk1 = new Package("massage", 10);
        MailPackage p1 = new MailPackage(AUSTIN_POWERS, "End", pk1);
        s1.processMail(m1);
        s1.processMail(m2);
        s1.processMail(m3);
        s1.processMail(p1);
    }

    public static class UntrustworthyMailWorker implements MailService {

        private final MailService[] mailServices;
        private final RealMailService realMailService;

        public UntrustworthyMailWorker(MailService[] mailServices) {
            this.mailServices = mailServices;
            realMailService = new RealMailService();
        }

        public RealMailService getRealMailService() {
            return realMailService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            Sendable s = mail;
            for (MailService mailService : mailServices) {
                s = mailService.processMail(s);
            }
            return realMailService.processMail(s);
        }
    }

    public static class Spy implements MailService {

        private final Logger logger;

        public Spy(Logger logger) {
            this.logger = logger;
        } //конструктор класса Spy

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof  MailMessage) {
                MailMessage message = (MailMessage) mail;
                if (AUSTIN_POWERS.equals(message.getFrom()) || AUSTIN_POWERS.equals(message.getTo())) {
                    logger.warning(String.format("Detected target mail correspondence: from %s to %s \"%s\"",
                            message.getFrom(), message.getTo(), message.getMessage()));
                } else {
                    logger.info(String.format("Usual correspondence: from %s to %s", message.getFrom(), message.getTo()));
                }
            }
            return mail;
        }
    }

    public static class Thief implements MailService {

        private final int minPrice;
        private int stolenValue;

        public Thief(int minPrice) {
            this.minPrice = minPrice;
            stolenValue = 0;
        }

        public int getStolenValue() {
            return stolenValue;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                final MailPackage pkg = (MailPackage) mail;
                if (pkg.getContent() != null && pkg.getContent().getPrice() >= minPrice) {
                    stolenValue = stolenValue + pkg.getContent().getPrice();
                    return new MailPackage(pkg.getFrom(), pkg.getTo(),
                            new Package(String.format("stones instead of %s", pkg.getContent().getContent()), 0));
                }
            }
            return mail;
        }
    }

    public static class Inspector implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                final MailPackage pkg = (MailPackage) mail;
                if (pkg.getContent() != null) {
                    if (WEAPONS.equals(pkg.getContent().getContent()) || BANNED_SUBSTANCE.equals(pkg.getContent().getContent()))
                        throw new IllegalPackageException();
                    if (pkg.getContent().getContent().contains("stones")) throw new StolenPackageException();
                }
            }
            return mail;
        }
    }

    public static class StolenPackageException extends RuntimeException {
        public StolenPackageException() {
        }

        public StolenPackageException(String message) {
            super(message);
        }
    }

    public static class IllegalPackageException extends RuntimeException {
        public IllegalPackageException() {
        }

        public IllegalPackageException(String message) {
            super(message);
        }
    }

}
