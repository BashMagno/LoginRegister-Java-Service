package sqlconexion;

public class InicioSesionFrame extends javax.swing.JFrame
{

    /**
     * Creates new form InicioSesionFrame
     */
    public InicioSesionFrame()
    {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JPasswordField();
        userLabel = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAdminLogin = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 150, 90));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Usuario o email:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña:");

        passwordLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordLabel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                passwordLabelActionPerformed(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userLabel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                userLabelActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(170, 100, 10));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(40, 150, 90));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoginActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel4.setText("Si no tiene una cuenta, registrese.");

        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel5.setText("Y si eres administrador ->");

        btnAdminLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnAdminLogin.setText("Iniciar sesión como Administrador");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(221, 221, 221))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                        .addComponent(btnRegistrar)
                                        .addGap(45, 45, 45))
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(btnAdminLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnRegistrar))
                        .addGap(9, 9, 9)))
                .addGap(18, 18, 18)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userLabelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_userLabelActionPerformed
    {//GEN-HEADEREND:event_userLabelActionPerformed

    }//GEN-LAST:event_userLabelActionPerformed

    private void passwordLabelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_passwordLabelActionPerformed
    {//GEN-HEADEREND:event_passwordLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordLabelActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLoginActionPerformed
    {//GEN-HEADEREND:event_btnLoginActionPerformed
        AlexLibreria enc = new AlexLibreria();

        String username = userLabel.getText();
        int carUsername = enc.contarCaracteres(username);
        if (carUsername > 24)
        {
            errorLabel.setText("El nombre de usuario o email no puede contener más de 24 caracteres");
        } else if (carUsername <= 3)
        {
            errorLabel.setText("El nombre de usuario o email tiene que tener al menos 4 caracteres");
        } else
        {
            String password = passwordLabel.getText();
            password = enc.encriptarMD5(password);

            // Inicio de sesión
            boolean autenticado = LoginService.autenticar(username, username, password);
            if (autenticado)
            {
                System.out.println("Inicio de sesión exitoso. Bienvenido de nuevo " + username);
                errorLabel.setText("Bienvenido de nuevo " + username);
            } else
            {
                System.out.println("Credenciales incorrectas.");
                errorLabel.setText("Usuario o contraseña no correcto/s o no figura en la base de datos. Pruebe a registrarse primero.");

            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLimpiarActionPerformed
    {//GEN-HEADEREND:event_btnLimpiarActionPerformed
        userLabel.setText("");
        passwordLabel.setText("");
        errorLabel.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try
        {
            dispose();
            RegistroFrame regFrame = new RegistroFrame();
            regFrame.setVisible(true);
        } catch (Exception e)
        {
            System.out.println("Error: " + e);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAdminLoginActionPerformed
    {//GEN-HEADEREND:event_btnAdminLoginActionPerformed
        // TODO add your handling code here:
                try
        {
            dispose();
            InicioSesionAdminFrame adminFrame = new InicioSesionAdminFrame();
            adminFrame.setVisible(true);
        } catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new InicioSesionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordLabel;
    private javax.swing.JTextField userLabel;
    // End of variables declaration//GEN-END:variables
}
